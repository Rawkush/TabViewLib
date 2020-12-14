# TabViewLib

  ![Maintenance](https://img.shields.io/badge/Maintained%3F-No-red.svg)  ![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)
 ![GitHub last commit](https://img.shields.io/github/last-commit/rawkush/TabViewLib?style=plastic)
 ![GitHub Release Date](https://img.shields.io/github/release-date/rawkush/TabViewLib?style=plastic) ![Lines of code](https://img.shields.io/tokei/lines/github/rawkush/TabViewLib?style=plastic)
   ![GitHub issues](https://img.shields.io/github/issues/rawkush/TabViewLib?style=plastic) ![GitHub closed issues](https://img.shields.io/github/issues-closed/rawkush/TabViewLib?style=plastic)    ![GitHub forks](https://img.shields.io/github/forks/rawkush/TabViewLib?style=social)
   ![GitHub Repo stars](https://img.shields.io/github/stars/rawkush/TabViewLib?style=social)
   ![GitHub watchers](https://img.shields.io/github/watchers/rawkush/TabViewLib?style=social) <br /> ![GitHub all releases](https://img.shields.io/github/downloads/rawkush/TabViewLib/total?style=plastic) <br />

   ![GitHub](https://img.shields.io/github/license/rawkush/TabViewLib?style=plastic)
![ViewCount](https://views.whatilearened.today/views/github/rawkush/tabviewlib.svg)   

Library for creating a tab view without any effort

# Download

step 1. Add it in your root build.gradle at the end of repositories:
```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  ``` 
  Step 2. Add the dependency
  ```java
  dependencies {
	        implementation 'com.github.Rawkush:TabViewLib:0.1.1'
	}
 ```


# Usage

Extend your activity from TutorialActivity and Add fragments in onCreate after super call

```java

public class MainActivity extends TabView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addTabs  // use this if you wants tabs 
        addFragment(new FragmentModel(new fragment1(),"tab1"));
        addFragment(new FragmentModel(new fragment2(),"tab2"));

	}
}
```
```java
        addFragment(new FragmentModel(new fragment1(),"tab1")); // adds fragment and create View
```

if you wish to use your own layout then just add a viewpager and a Tablayout(Not necessary)
initialse your viewpager and pass it to the initViewPagerAndTabLayout() method.
below is the example how to do this
```java

ViewPager viewPager;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.layout);
       viewPager=findViewById(R.id.viewpager);
       initViewpagerAndTablayout(viewPager);
       addFragment(new FragmentModel(new fragment1(),"tab1"));
       addFragment(new FragmentModel(new fragment2(),"tab2"));

    }

```

# Projects using TabViewlib

<ol>
	
<li>
	<a href="https://github.com/Rawkush/RawAnime">RawAnime</a>
</li>

<li>

<a href="https://github.com/Rawkush/AnimeWallpapers">AnimeWallpaper</a>
</li>

</ol>
