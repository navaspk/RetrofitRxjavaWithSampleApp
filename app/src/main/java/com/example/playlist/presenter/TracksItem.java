package com.example.playlist.presenter;

import com.google.gson.annotations.SerializedName;

public class TracksItem {

	@SerializedName("comment_count")
	private int commentCount;

	@SerializedName("downloadable")
	private boolean downloadable;

	@SerializedName("release")
	private String release;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("description")
	private String description;

	@SerializedName("original_content_size")
	private int originalContentSize;

	@SerializedName("title")
	private String title;

	@SerializedName("track_type")
	private String trackType;

	@SerializedName("duration")
	private int duration;

	@SerializedName("video_url")
	private Object videoUrl;

	@SerializedName("original_format")
	private String originalFormat;

	@SerializedName("artwork_url")
	private String artworkUrl;

	@SerializedName("streamable")
	private boolean streamable;

	@SerializedName("tag_list")
	private String tagList;

	@SerializedName("release_month")
	private Object releaseMonth;

	@SerializedName("genre")
	private String genre;

	@SerializedName("release_day")
	private Object releaseDay;

	@SerializedName("id")
	private int id;

	@SerializedName("state")
	private String state;

	@SerializedName("last_modified")
	private String lastModified;

	@SerializedName("label_name")
	private String labelName;

	@SerializedName("commentable")
	private boolean commentable;

	@SerializedName("bpm")
	private Object bpm;

	@SerializedName("favoritings_count")
	private int favoritingsCount;

	@SerializedName("kind")
	private String kind;

	@SerializedName("purchase_url")
	private Object purchaseUrl;

	@SerializedName("release_year")
	private Object releaseYear;

	@SerializedName("key_signature")
	private String keySignature;

	@SerializedName("isrc")
	private String isrc;

	@SerializedName("sharing")
	private String sharing;

	@SerializedName("uri")
	private String uri;

	@SerializedName("attachments_uri")
	private String attachmentsUri;

	@SerializedName("download_count")
	private int downloadCount;

	@SerializedName("license")
	private String license;

	@SerializedName("purchase_title")
	private Object purchaseTitle;

	@SerializedName("user_id")
	private int userId;

	@SerializedName("embeddable_by")
	private String embeddableBy;

	@SerializedName("waveform_url")
	private String waveformUrl;

	@SerializedName("permalink")
	private String permalink;

	@SerializedName("permalink_url")
	private String permalinkUrl;

	@SerializedName("user")
	private User user;

	@SerializedName("label_id")
	private Object labelId;

	@SerializedName("stream_url")
	private String streamUrl;

	@SerializedName("playback_count")
	private int playbackCount;

	public void setCommentCount(int commentCount){
		this.commentCount = commentCount;
	}

	public int getCommentCount(){
		return commentCount;
	}

	public void setDownloadable(boolean downloadable){
		this.downloadable = downloadable;
	}

	public boolean isDownloadable(){
		return downloadable;
	}

	public void setRelease(String release){
		this.release = release;
	}

	public String getRelease(){
		return release;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setOriginalContentSize(int originalContentSize){
		this.originalContentSize = originalContentSize;
	}

	public int getOriginalContentSize(){
		return originalContentSize;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setTrackType(String trackType){
		this.trackType = trackType;
	}

	public String getTrackType(){
		return trackType;
	}

	public void setDuration(int duration){
		this.duration = duration;
	}

	public int getDuration(){
		return duration;
	}

	public void setVideoUrl(Object videoUrl){
		this.videoUrl = videoUrl;
	}

	public Object getVideoUrl(){
		return videoUrl;
	}

	public void setOriginalFormat(String originalFormat){
		this.originalFormat = originalFormat;
	}

	public String getOriginalFormat(){
		return originalFormat;
	}

	public void setArtworkUrl(String artworkUrl){
		this.artworkUrl = artworkUrl;
	}

	public String getArtworkUrl(){
		return artworkUrl;
	}

	public void setStreamable(boolean streamable){
		this.streamable = streamable;
	}

	public boolean isStreamable(){
		return streamable;
	}

	public void setTagList(String tagList){
		this.tagList = tagList;
	}

	public String getTagList(){
		return tagList;
	}

	public void setReleaseMonth(Object releaseMonth){
		this.releaseMonth = releaseMonth;
	}

	public Object getReleaseMonth(){
		return releaseMonth;
	}

	public void setGenre(String genre){
		this.genre = genre;
	}

	public String getGenre(){
		return genre;
	}

	public void setReleaseDay(Object releaseDay){
		this.releaseDay = releaseDay;
	}

	public Object getReleaseDay(){
		return releaseDay;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setLastModified(String lastModified){
		this.lastModified = lastModified;
	}

	public String getLastModified(){
		return lastModified;
	}

	public void setLabelName(String labelName){
		this.labelName = labelName;
	}

	public String getLabelName(){
		return labelName;
	}

	public void setCommentable(boolean commentable){
		this.commentable = commentable;
	}

	public boolean isCommentable(){
		return commentable;
	}

	public void setBpm(Object bpm){
		this.bpm = bpm;
	}

	public Object getBpm(){
		return bpm;
	}

	public void setFavoritingsCount(int favoritingsCount){
		this.favoritingsCount = favoritingsCount;
	}

	public int getFavoritingsCount(){
		return favoritingsCount;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getKind(){
		return kind;
	}

	public void setPurchaseUrl(Object purchaseUrl){
		this.purchaseUrl = purchaseUrl;
	}

	public Object getPurchaseUrl(){
		return purchaseUrl;
	}

	public void setReleaseYear(Object releaseYear){
		this.releaseYear = releaseYear;
	}

	public Object getReleaseYear(){
		return releaseYear;
	}

	public void setKeySignature(String keySignature){
		this.keySignature = keySignature;
	}

	public String getKeySignature(){
		return keySignature;
	}

	public void setIsrc(String isrc){
		this.isrc = isrc;
	}

	public String getIsrc(){
		return isrc;
	}

	public void setSharing(String sharing){
		this.sharing = sharing;
	}

	public String getSharing(){
		return sharing;
	}

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}

	public void setAttachmentsUri(String attachmentsUri){
		this.attachmentsUri = attachmentsUri;
	}

	public String getAttachmentsUri(){
		return attachmentsUri;
	}

	public void setDownloadCount(int downloadCount){
		this.downloadCount = downloadCount;
	}

	public int getDownloadCount(){
		return downloadCount;
	}

	public void setLicense(String license){
		this.license = license;
	}

	public String getLicense(){
		return license;
	}

	public void setPurchaseTitle(Object purchaseTitle){
		this.purchaseTitle = purchaseTitle;
	}

	public Object getPurchaseTitle(){
		return purchaseTitle;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setEmbeddableBy(String embeddableBy){
		this.embeddableBy = embeddableBy;
	}

	public String getEmbeddableBy(){
		return embeddableBy;
	}

	public void setWaveformUrl(String waveformUrl){
		this.waveformUrl = waveformUrl;
	}

	public String getWaveformUrl(){
		return waveformUrl;
	}

	public void setPermalink(String permalink){
		this.permalink = permalink;
	}

	public String getPermalink(){
		return permalink;
	}

	public void setPermalinkUrl(String permalinkUrl){
		this.permalinkUrl = permalinkUrl;
	}

	public String getPermalinkUrl(){
		return permalinkUrl;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void setLabelId(Object labelId){
		this.labelId = labelId;
	}

	public Object getLabelId(){
		return labelId;
	}

	public void setStreamUrl(String streamUrl){
		this.streamUrl = streamUrl;
	}

	public String getStreamUrl(){
		return streamUrl;
	}

	public void setPlaybackCount(int playbackCount){
		this.playbackCount = playbackCount;
	}

	public int getPlaybackCount(){
		return playbackCount;
	}

	@Override
 	public String toString(){
		return 
			"TracksItem{" + 
			"comment_count = '" + commentCount + '\'' + 
			",downloadable = '" + downloadable + '\'' + 
			",release = '" + release + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",description = '" + description + '\'' + 
			",original_content_size = '" + originalContentSize + '\'' + 
			",title = '" + title + '\'' + 
			",track_type = '" + trackType + '\'' + 
			",duration = '" + duration + '\'' + 
			",video_url = '" + videoUrl + '\'' + 
			",original_format = '" + originalFormat + '\'' + 
			",artwork_url = '" + artworkUrl + '\'' + 
			",streamable = '" + streamable + '\'' + 
			",tag_list = '" + tagList + '\'' + 
			",release_month = '" + releaseMonth + '\'' + 
			",genre = '" + genre + '\'' + 
			",release_day = '" + releaseDay + '\'' + 
			",id = '" + id + '\'' + 
			",state = '" + state + '\'' + 
			",last_modified = '" + lastModified + '\'' + 
			",label_name = '" + labelName + '\'' + 
			",commentable = '" + commentable + '\'' + 
			",bpm = '" + bpm + '\'' + 
			",favoritings_count = '" + favoritingsCount + '\'' + 
			",kind = '" + kind + '\'' + 
			",purchase_url = '" + purchaseUrl + '\'' + 
			",release_year = '" + releaseYear + '\'' + 
			",key_signature = '" + keySignature + '\'' + 
			",isrc = '" + isrc + '\'' + 
			",sharing = '" + sharing + '\'' + 
			",uri = '" + uri + '\'' + 
			",attachments_uri = '" + attachmentsUri + '\'' + 
			",download_count = '" + downloadCount + '\'' + 
			",license = '" + license + '\'' + 
			",purchase_title = '" + purchaseTitle + '\'' + 
			",user_id = '" + userId + '\'' + 
			",embeddable_by = '" + embeddableBy + '\'' + 
			",waveform_url = '" + waveformUrl + '\'' + 
			",permalink = '" + permalink + '\'' + 
			",permalink_url = '" + permalinkUrl + '\'' + 
			",user = '" + user + '\'' + 
			",label_id = '" + labelId + '\'' + 
			",stream_url = '" + streamUrl + '\'' + 
			",playback_count = '" + playbackCount + '\'' + 
			"}";
		}
}