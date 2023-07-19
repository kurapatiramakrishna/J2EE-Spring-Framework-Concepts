package org.jsp1.autowiring;

public class author 
{ private String authorName;
private String authorId;

public author(String authorName, String authorId) {
    this.authorName = authorName;
    this.authorId = authorId;
}

// Getters and setters...


@Override
public String toString() 
{
    return "Author [authorName=" + authorName + ", authorId=" + authorId + "]";
}

public String getAuthorName() {
	return authorName;
}

public void setAuthorName(String authorName) {
	this.authorName = authorName;
}

public String getAuthorId() {
	return authorId;
}

public void setAuthorId(String authorId) {
	this.authorId = authorId;
}
}