# WaveLoadingView

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-WaveLoadingView-green.svg?style=true)](https://android-arsenal.com/details/1/2908)
[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)  

**WaveLoadingView** - An Android library that provides a realistic wave-loading effect.

<img src="/screenshots/ss.png" alt="screenshot" title="screenshot" width="400" height="450" /> 

## Sample

<img src="/screenshots/sample.gif" alt="sample" title="sample" width="400" height="680" />



## Usage

**For a working implementation of this project see the `sample/` folder.**

### Step 1

Include the library as a local library project or add the dependency in your build.gradle.

```groovy
dependencies {
    compile 'me.itangqi.waveloadingview:library:0.2.1'
    // I have uploaded v0.2.0 on 2016-05-21, if it doesn't take effect or your 
    // gradle cannot find it in maven central, you may try v0.2.0. 
}
```	
Or

Import the library, then add it to your /settings.gradle and /app/build.gradle. If you don't know how to do this, you can read my blog for help.

### Step 2

Include the WaveLoadingView widget in your layout. And you can customize it like this.
   
```xml
<me.itangqi.waveloadingview.WaveLoadingView
    android:id="@+id/waveLoadingView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:wlv_borderColor="@color/colorAccent"
    app:wlv_borderWidth="3dp"
    app:wlv_progressValue="40"
    app:wlv_shapeType="circle"
    app:wlv_round_rectangle="true"
    app:wlv_triangle_direction="north"
    app:wlv_titleCenter="Center Title"
    app:wlv_titleCenterColor="@color/colorPrimaryText"
    app:wlv_titleCenterSize="24sp"
    app:wlv_waveAmplitude="70"
    app:wlv_waveColor="@color/colorAccent"/>   
```

### Step 3

You can write some animation codes to the callbacks such as setOnCheckedChangeListener, onProgressChanged, etc in your Activity.


```java
WaveLoadingView mWaveLoadingView = (WaveLoadingView) findViewById(R.id.waveLoadingView);
	mWaveLoadingView.setShapeType(WaveLoadingView.ShapeType.CIRCLE);
	mWaveLoadingView.setTopTitle("Top Title");
	mWaveLoadingView.setCenterTitleColor(Color.GRAY);
	mWaveLoadingView.setBottomTitleSize(18);
	mWaveLoadingView.setProgressValue(80);
	mWaveLoadingView.setBorderWidth(10);
	mWaveLoadingView.setAmplitudeRatio(60);
	mWaveLoadingView.setWaveColor(Color.GRAY);
	mWaveLoadingView.setBorderColor(Color.GRAY);
```

## Customization

Please feel free to :)

|name|format|description|
|:---:|:---:|:---:|
| wlv_borderWidth | dimension |Border width, default is 0
| wlv_borderColor | color | Border color
| wlv_progressValue | integer | Pprogress value, default is 50
| wlv_shapeType | enum | Shape type, default is circle
| wlv_triangle_direction | enum | Triangle direction, default is north
| wlv_rectangle_width | integer | Rectangle width, default is 700
| wlv_rectangle_height | integer | Rectangle height, default is 350
| wlv_round_rectangle | boolean | Is round rectangle, default is false
| wlv_round_rectangle_x_and_y | integer | Round Rectangle corners, default is 30
| wlv_waveColor | color | Wave color
| wlv_waveAmplitude | float | Wave amplitude
| wlv_titleTop | string | Top title content, default is null
| wlv_titleCenter | string | Center title content, default is null
| wlv_titleBottom | string | Bottom title content, default is null
| wlv_titleTopSize | dimension | Top title size, default is 18 
| wlv_titleCenterSize | dimension | Center title size, default is 22
| wlv_titleBottomSize | dimension | Bottom size, default is 18
| wlv_titleTopColor | color | Top title color
| wlv_titleCenterColor | color | Center title color 
| wlv_titleBottomColor | color | Bottom title color 


**All attributes have their respective getters and setters to change them at runtime.**


## Change Log

### 0.2.1 (2016-05-21)

#### Update:

- Update more shape types like: Rectangle, Round Rectangle, Triangle...etc [#7](https://github.com/tangqi92/WaveLoadingView/issues/7)
- Update `build.gradle`
- Update Sample

#### Plan:

- Title position fit shape size

### 0.2.0 (2016-02-17)

#### Implemented enhancements:

- Prefix the attributes with "wlv"

#### Fixed bugs:

- setProgressValue() increase doesn't conform to logic [#8](https://github.com/tangqi92/WaveLoadingView/issues/8)

#### Update:

- Update `build.gradle`
- Update Sample

### 0.1.5 (2016-01-14)

#### Fixed bugs:

- IllegalArgumentException: width and height must be > 0 while loading Bitmap from View [#6](https://github.com/tangqi92/WaveLoadingView/issues/6)

### 0.1.4 (2015-12-17)

#### Fixed bugs:

- setProgressValue() doesn't change the value of mProgressValue [#4](https://github.com/tangqi92/WaveLoadingView/issues/4)


### 0.1.3

#### Fixed bugs:

- Attribute "borderWidth" has already been defined [#2](https://github.com/tangqi92/WaveLoadingView/issues/2)


## Demo

[Download](https://github.com/tangqi92/WaveLoadingView/releases/download/v0.2.1/sample-release-unsigned.apk)

## Apps using the WaveLoadingView

Feel free to send me new projects

- [Easy Fit Calorie Counter](https://play.google.com/store/apps/details?id=com.marioherzberg.swipeviews_tutorial1)


## Community

Looking for contributors, feel free to fork !

Tell me if you're using my library in your application, I'll share it in this README.


## Thanks

Inspired by 

- [WaveView](https://github.com/gelitenight/WaveView) created by [gelitenight](https://github.com/gelitenight)
- [CircularFillableLoaders](https://github.com/lopspower/CircularFillableLoaders) created by [lopspower](https://github.com/lopspower)


## Contact Me

Born in 1992, now a student of Southeast University, master of Software Engineering. Loving technology, programming, reading and sports.

I will graduate in June 2017, expect the internship or full-time job in Android or iOS.

If you have any questions or want to make friends with me, please feel free to contact me : [imtangqi#gmail.com](mailto:imtangqi@gmail.com "Welcome to contact me")


## License

    Copyright 2016 Qi Tang

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.

