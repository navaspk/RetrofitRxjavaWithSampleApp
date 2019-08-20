Local app name : Playlist

This application shows track list info to user, which consisting track name total duration and image of the track.
Since we have queried to server and getting response, we can able to show any kind of content based on requirement

HLD(HIGH LEVEL DESIGN):
This has been implemented based on MVP architecture (model view presenter). 

Model:
1. PlaylistService.java
2. NetworkConstants.java
The model consisting class called PlaylistService.
This class is API interface used to query to server and get the response.

View:
1. PlaylistMainActivity.java
2. PlayListHomeFragment.java
View consisting of both activity and fragment to display the content, In this project may require only Activity,
even though we added fragment for code integrity. In future many fragment can be added for populating multiple views.
Based on above classed we have implemented set of UI as below.
In PlaylistMainActivity.java
 * 1. Navigation drawer
 * 2. Tool bar view
 * 3. Frame layout for adding or replacing fragment
 * 4. Dynamically adding snack bar as it parent view is coordinator layout
 
In PlayListHomeFragment.java
 * 1. Swipe to refresh
 * 2. Recycler view
 * 3. Progress bar view 
 

Presenter:
1. Response.java
2. TracksItem.java
3. User.java
These are pojo class to provide content to UI based on query. Pojo class has been filled with data by using 
RxJava, Retrofit and GSON. Once retrofit provided response, same time automatically data storing into POJO class by Gson. 
After that Observable return the pojo class object asynchronously. So that observer will notify once the 
data emitted from observable.


LLD(LOW LEVEL DESIGN)
1. Platform used:
Android 
2. Language: 
Java
3. Library used:
Retrofit, RxJava, Okhttp and Gson 
4. DataStructure: 
List


Description:
Retrofit is a type safe http client used to getting data from server, it calling to server by using 
java interface with many request methods and request params. Okhttp used for network call. 
RxJava is another library added in this to get asynchronous call. This is working based on 
observer and observable concept. Now a days RxJava is more important as this is having good 
feature like able to perform network call, perform synchronous and asynchronous call, performing background listening.

Other Class usage:
PlaylistAdapter.java : Adapter class is taking care to draw the view and bind the data to view with the
help of holder class
BaseViewHolder.java : Base holder for each view, it contains track title, duration and track image

In order to work unit test, we need to add corresponding dependancy in build.gradle
//rxjava+retrofit+okhttp+gson
implementation 'io.reactivex.rxjava2:rxandroid:2.0.1'
implementation 'io.reactivex.rxjava2:rxjava:2.0.9'
implementation 'com.squareup.retrofit2:adapter-rxjava2:2.2.0'
implementation 'com.squareup.retrofit2:retrofit:2.2.0'
implementation 'com.squareup.retrofit2:converter-gson:2.1.0'
implementation 'com.squareup.okhttp3:logging-interceptor:3.4.1'
implementation 'com.squareup.okhttp3:okhttp:3.4.1'
implementation 'com.jakewharton.rxrelay2:rxrelay:2.0.0'

implementation 'com.squareup.picasso:picasso:2.5.2'


