package courseApi.java.topic;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicContoller {
    @Autowired
	private TopicControllerService topicService;
    
    
	//@RequestMapping("/topic")
	//public List<Topic> getTopic() {
	 //    return topicService.getAllTopics();	
//	}
	
	
	/*@RequestMapping("/topic/{foo}")*/
	//@RequestMapping("/topic/{id}")
	//public Topic getTopiById(/*@PathVariable("foo")*/ @PathVariable String id) {
	//	return topicService.getTopicById(id);
	//}
	
	//@RequestMapping(method=RequestMethod.POST,value="/topic")
	//public void addTopic(@RequestBody Topic topic) {
	//	topicService.addTopic(topic);
	//}
	
//	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{id}")
	//public void deleteTopic(@PathVariable String id) {
	//	topicService.deleteTopic(id);
	//}
	
//	@RequestMapping(method=RequestMethod.PUT,value="/topic/{id}")
	//public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		//topicService.updateTopic(id,topic);
	//}
	
	/*----  TopicControllerJPA---------*/
	
	@RequestMapping("/topic")
	public List<TopicJPA> getTopicJPA() {
	     return topicService.getAllTopicsJPA();	
	}
	
	
	/*@RequestMapping("/topic/{foo}")*/
	@RequestMapping("/topic/{name}")
	public TopicJPA getTopiByIdJPA(/*@PathVariable("foo")*/ @PathVariable String name) {
		return topicService.getTopicByIdJPA(name);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topic")
	public void addTopicJPA(@RequestBody TopicJPA topic) {
		topicService.addTopicJPA(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{name}")
	public void deleteTopicJPA(@PathVariable String name) {
		topicService.deleteTopicJPA(name);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{name}")
	public void updateTopicJPA(@RequestBody TopicJPA topic,@PathVariable String name) {
		topicService.updateTopicJPA(name,topic);
	}
	
	
	
}
