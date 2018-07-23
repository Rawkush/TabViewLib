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
	        implementation 'com.github.Rawkush:TabViewLib:0.1.0'
	}
 ```


# Usage

Extend your activity from TutorialActivity and Add fragments in onCreate after super call

```java

public class MainActivity extends TabView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initTabView();  // use this if you wants tabs 
        addFragment(new FragmentModel(new fragment1(),"tab1"));
        addFragment(new FragmentModel(new fragment2(),"tab2"));

	}
}
```
```java
        addFragment(new FragmentModel(new fragment1(),"tab1")); // adds fragment and create View
```

# Helper Methods
if using your own layout override the following function

```java
@Override
    public void initViewPager() {
        super.initViewPager();
     // initialise your viewpager here
             viewPager=(ViewPager)findViewById(R.id.viewpager);

    }
```

```java

    @Override
    public void initTabView() {
        super.initTabView();
	//initialise your tabLayout Here and set it up with viepager, eg below
	 tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
    ```



