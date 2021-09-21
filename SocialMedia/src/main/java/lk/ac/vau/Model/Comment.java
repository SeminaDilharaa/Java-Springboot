package lk.ac.vau.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class Comment {
	@Id
	private long CommentId;
	private String Comment;
	@Column(columnDefinition = "datetime default now()")
	private String ComentedOn;
	@ManyToOne
	@JoinColumn(name = "commented_in",referencedColumnName = "PostId")
	private Post CommentedIn;
	@ManyToOne
	@JoinColumn(name = "commented_by",referencedColumnName = "UserId")
	private User CommentedBy;
	
	public Comment() {
		
	}
	
	

	public Comment(long commentId, String comment, String comentedOn, Post commentedIn, User commentedBy) {
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

	public String getComentedOn() {
		return ComentedOn;
	}

	public void setComentedOn(String comentedOn) {
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
