package lk.ac.vau.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
@XmlRootElement
@Entity
public class Post {
	@Id
	private long PostId;
	private String Title;
	private String Content; 
	@Temporal(TemporalType.TIMESTAMP)
	private Date CreatedOn;
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "owner_id",referencedColumnName = "UserId")
	@JsonIgnore
	private User Owner;
		
	public Post() {
		
	}


	public Post(long postId, String title, String content, Date createdOn, User owner) {
		super();
		PostId = postId;
		Title = title;
		Content = content;
		CreatedOn = createdOn;
		Owner = owner;
		
	}


	public long getPostId() {
		return PostId;
	}


	public void setPostId(long postId) {
		PostId = postId;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getContent() {
		return Content;
	}


	public void setContent(String content) {
		Content = content;
	}


	public Date getCreatedOn() {
		return CreatedOn;
	}


	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}


	public User getOwner() {
		return Owner;
	}


	public void setOwner(User owner) {
		Owner = owner;
	}

}
