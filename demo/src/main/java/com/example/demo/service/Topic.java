package com.example.demo.service;

public class Topic {
private String id;
private String topicName;
private String desc;




public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTopicName() {
	return topicName;
}
public void setTopicName(String topicName) {
	this.topicName = topicName;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public Topic() {
	super();
}


public Topic(String id, String topicName, String desc) {
	super();
	this.id = id;
	this.topicName = topicName;
	this.desc = desc;
}

}
