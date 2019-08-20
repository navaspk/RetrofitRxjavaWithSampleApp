package com.example.playlist.presenter;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
 * POJO class used to hold the response, data update will take care for this class by GSON
 */
public class Response {

	@SerializedName("downloadable")
	private Object downloadable;

	@SerializedName("release")
	private String release;

	@SerializedName("description")
	private String description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("title")
	private String title;

	@SerializedName("type")
	private Object type;

	@SerializedName("track_count")
	private int trackCount;

	@SerializedName("duration")
	private int duration;

	@SerializedName("artwork_url")
	private String artworkUrl;

	@SerializedName("ean")
	private String ean;

	@SerializedName("streamable")
	private boolean streamable;

	@SerializedName("tag_list")
	private String tagList;

	@SerializedName("release_month")
	private Object releaseMonth;

	@SerializedName("release_day")
	private Object releaseDay;

	@SerializedName("genre")
	private String genre;

	@SerializedName("id")
	private int id;

	@SerializedName("label_name")
	private String labelName;

	@SerializedName("last_modified")
	private String lastModified;

	@SerializedName("kind")
	private String kind;

	@SerializedName("purchase_url")
	private Object purchaseUrl;

	@SerializedName("release_year")
	private Object releaseYear;

	@SerializedName("playlist_type")
	private Object playlistType;

	@SerializedName("sharing")
	private String sharing;

	@SerializedName("uri")
	private String uri;

	@SerializedName("tracks")
	private List<TracksItem> tracks;

	@SerializedName("license")
	private String license;

	@SerializedName("purchase_title")
	private Object purchaseTitle;

	@SerializedName("user_id")
	private int userId;

	@SerializedName("embeddable_by")
	private String embeddableBy;

	@SerializedName("permalink_url")
	private String permalinkUrl;

	@SerializedName("permalink")
	private String permalink;

	@SerializedName("user")
	private User user;

	@SerializedName("label_id")
	private Object labelId;

	public void setDownloadable(Object downloadable){
		this.downloadable = downloadable;
	}

	public Object getDownloadable(){
		return downloadable;
	}

	public void setRelease(String release){
		this.release = release;
	}

	public String getRelease(){
		return release;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setType(Object type){
		this.type = type;
	}

	public Object getType(){
		return type;
	}

	public void setTrackCount(int trackCount){
		this.trackCount = trackCount;
	}

	public int getTrackCount(){
		return trackCount;
	}

	public void setDuration(int duration){
		this.duration = duration;
	}

	public int getDuration(){
		return duration;
	}

	public void setArtworkUrl(String artworkUrl){
		this.artworkUrl = artworkUrl;
	}

	public String getArtworkUrl(){
		return artworkUrl;
	}

	public void setEan(String ean){
		this.ean = ean;
	}

	public String getEan(){
		return ean;
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

	public void setReleaseDay(Object releaseDay){
		this.releaseDay = releaseDay;
	}

	public Object getReleaseDay(){
		return releaseDay;
	}

	public void setGenre(String genre){
		this.genre = genre;
	}

	public String getGenre(){
		return genre;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLabelName(String labelName){
		this.labelName = labelName;
	}

	public String getLabelName(){
		return labelName;
	}

	public void setLastModified(String lastModified){
		this.lastModified = lastModified;
	}

	public String getLastModified(){
		return lastModified;
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

	public void setPlaylistType(Object playlistType){
		this.playlistType = playlistType;
	}

	public Object getPlaylistType(){
		return playlistType;
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

	public void setTracks(List<TracksItem> tracks){
		this.tracks = tracks;
	}

	public List<TracksItem> getTracks(){
		return tracks;
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

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"downloadable = '" + downloadable + '\'' + 
			",release = '" + release + '\'' + 
			",description = '" + description + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			",track_count = '" + trackCount + '\'' + 
			",duration = '" + duration + '\'' + 
			",artwork_url = '" + artworkUrl + '\'' + 
			",ean = '" + ean + '\'' + 
			",streamable = '" + streamable + '\'' + 
			",tag_list = '" + tagList + '\'' + 
			",release_month = '" + releaseMonth + '\'' + 
			",release_day = '" + releaseDay + '\'' + 
			",genre = '" + genre + '\'' + 
			",id = '" + id + '\'' + 
			",label_name = '" + labelName + '\'' + 
			",last_modified = '" + lastModified + '\'' + 
			",kind = '" + kind + '\'' + 
			",purchase_url = '" + purchaseUrl + '\'' + 
			",release_year = '" + releaseYear + '\'' + 
			",playlist_type = '" + playlistType + '\'' + 
			",sharing = '" + sharing + '\'' + 
			",uri = '" + uri + '\'' + 
			",tracks = '" + tracks + '\'' + 
			",license = '" + license + '\'' + 
			",purchase_title = '" + purchaseTitle + '\'' + 
			",user_id = '" + userId + '\'' + 
			",embeddable_by = '" + embeddableBy + '\'' + 
			",permalink_url = '" + permalinkUrl + '\'' + 
			",permalink = '" + permalink + '\'' + 
			",user = '" + user + '\'' + 
			",label_id = '" + labelId + '\'' + 
			"}";
		}
}