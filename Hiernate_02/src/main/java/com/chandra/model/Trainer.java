package com.chandra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRAINER")
public class Trainer {

	@Id
	@Column(name="TRAINER_ID")
	public int tid;
	@Column(name="TRAINER_NAME")
	public String tname;
	@Column(name="TRAINER_SUBJECT")
	public String subject;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
