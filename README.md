# WaveLoadingView

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-WaveLoadingView-green.svg?style=true)](https://android-arsenal.com/details/1/2908)
[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)  

**WaveLoadingView** - An Android library providing to realize wave loading effect.

<img src="/screenshots/ss.png" alt="screenshot" title="screenshot" width="450" height="495" /> 

## Sample

<img src="/screenshots/sample.gif" alt="sample" title="sample" width="400" height="680" />



## Usage

**For a working implementation of this project see the `sample/` folder.**

### Step 1

Include the library as local library project or add the dependency in your build.gradle.

```groovy
dependencies {
    compile 'me.itangqi.waveloadingview:library:0.1.2'
}
```	
### Step 2

Include the WaveLoadingView widget in your layout. And you can customize it like this.
   
```xml
<me.itangqi.waveloadingview.WaveLoadingView
        android:id="@+id/waveLoadingView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:borderWidth="3"
        app:borderColor="@color/colorAccent"
        app:progressValue="40"
        app:shapeType="circle"
        app:waveColor="@color/colorAccent"
        app:waveAmplitude="50"
        app:titleTop="Top Title"
        app:titleTopColor="@color/colorPrimaryText"
        app:titleTopSize="20"
        app:titleCenter="Center Title"
        app:titleCenterColor="@color/colorPrimaryText"
        app:titleCenterSize="24"
        app:titleBottom="Bottom Title"
        app:titleBottomColor="@color/colorPrimaryText"
        app:titleBottomSize="20"         
```

### Step 3

Absolutely，you can write some animation codes to the callbacks such as setOnCheckedChangeListener, onProgressChanged, etc in your Activity.


```java
WaveLoadingView mWaveLoadingView = (WaveLoadingView) findViewById(R.id.waveLoadingView);
	mWaveLoadingView.setShapeType(WaveLoadingView.ShapeType.CIRCLE);
	mWaveLoadingView.setTopTitle("Top Title");
	mWaveLoadingView.setCenterTitleColor(Color.GRAY);
	mWaveLoadingView.setBottomTitleSize(18);
	mWaveLoadingView.setProgress(80);
	mWaveLoadingView.setBorderWidth(10);
	mWaveLoadingView.setAmplitudeRatio(60);
	mWaveLoadingView.setWaveColor(Color.GRAY);
	mWaveLoadingView.setBorderColor(Color.GRAY);
```

## Customization

Do what you what :)

* `app:borderWidth` (integer) Default to be 0
* `app:borderColor` (color)
* `app:progressValue` (integer) Set ProgressValue
* `app:shapeType` (circle/square) Default to be circle
* `app:waveColor` (color)
* `app:waveAmplitude` (integer) Set Wave Amplitude (between 1 and 100)
* `app:titleTopSize` (float) 
* `app:titleCenterSize` (float)
* `app:titleBottomSize` (float)
* `app:titleTopColor` (color)
* `app:titleCenterColor` (color)
* `app:titleBottomColor` (color)
* `app:titleTop` (string) default to be ""
* `app:titleCenter` (string)
* `app:titleBottom ` (string)

**All attributes have their respective getters and setters to change them at runtime.**

## Demo

[Download](https://github.com/tangqi92/WaveLoadingView/releases/download/v0.1.2/sample-release-unsigned.apk)



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

    Copyright 2014 Qi Tang

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.

