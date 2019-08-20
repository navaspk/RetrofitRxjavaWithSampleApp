package com.example.playlist.presenter;

import com.google.gson.annotations.SerializedName;

public class User {

	@SerializedName("avatar_url")
	private String avatarUrl;

	@SerializedName("kind")
	private String kind;

	@SerializedName("id")
	private int id;

	@SerializedName("permalink_url")
	private String permalinkUrl;

	@SerializedName("permalink")
	private String permalink;

	@SerializedName("uri")
	private String uri;

	@SerializedName("last_modified")
	private String lastModified;

	@SerializedName("username")
	private String username;

	public void setAvatarUrl(String avatarUrl){
		this.avatarUrl = avatarUrl;
	}

	public String getAvatarUrl(){
		return avatarUrl;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getKind(){
		return kind;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPermalinkUrl(String permalinkUrl){
		this.permalinkUrl = permalinkUrl;
	}

	public String getPermalinkUrl(){
		return permalinkUrl;
	}

	public void setPermalink(String permalink){
		this.permalink = permalink;
	}

	public String getPermalink(){
		return permalink;
	}

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}

	public void setLastModified(String lastModified){
		this.lastModified = lastModified;
	}

	public String getLastModified(){
		return lastModified;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"User{" + 
			"avatar_url = '" + avatarUrl + '\'' + 
			",kind = '" + kind + '\'' + 
			",id = '" + id + '\'' + 
			",permalink_url = '" + permalinkUrl + '\'' + 
			",permalink = '" + permalink + '\'' + 
			",uri = '" + uri + '\'' + 
			",last_modified = '" + lastModified + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}