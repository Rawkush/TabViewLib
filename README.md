# TabViewLib

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
