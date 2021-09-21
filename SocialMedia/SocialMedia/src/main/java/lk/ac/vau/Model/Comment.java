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
public class Comment {
	@Id
	private long CommentId;
	private String Comment;
	@Temporal(TemporalType.TIMESTAMP)
	private Date ComentedOn;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "commented_in",referencedColumnName = "PostId")
	@JsonIgnore
	private Post CommentedIn;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "commented_by",referencedColumnName = "UserId")
	@JsonIgnore
	private User CommentedBy;
	
	public Comment() {
		
	}
	
	

	public Comment(long commentId, String comment, Date comentedOn, Post commentedIn, User commentedBy) {
		super();
		CommentId = commentId;
		Comment = comment;
		ComentedOn = comentedOn;
		CommentedIn = commentedIn;
		CommentedBy = commentedBy;
	}

	public long getCommentId() {
		return CommentId;
	}

	public void setCommentId(long commentId) {
		CommentId = commentId;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public Date getComentedOn() {
		return ComentedOn;
	}

	public void setComentedOn(Date comentedOn) {
		ComentedOn = comentedOn;
	}

	public Post getCommentedIn() {
		return CommentedIn;
	}

	public void setCommentedIn(Post commentedIn) {
		CommentedIn = commentedIn;
	}

	public User getCommentedBy() {
		return CommentedBy;
	}

	public void setCommentedBy(User commentedBy) {
		CommentedBy = commentedBy;
	}
	
	
}
