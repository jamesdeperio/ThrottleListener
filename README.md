## ThrottleListener
- avoid multiple execution of task.
- prevent bugs on multiple tap.
___
### USAGE
#### kotlin
```kotlin
view.setOnThrottleClickListener { 
    //todo
}
  
view.setOnThrottleClickListener(delayInMillis = 2000) { //750 default
    //todo
}

view.setOnClickListener(object :OnThrottleClickListener(delayInMillis = 2000){  //750 default
    override fun onThrottleClick(v: View) {
        //todo
    }
})         
```
#### java
```java
view.setOnClickListener(new OnThrottleClickListener(750) {
    @Override
    public void onThrottleClick(@NotNull View v) {
        //todo    
    }
});
```
___
## DEPENDENCIES
Thanks to the author of external Library used:
* [org.jetbrains.kotlin:kotlin-stdlib-jdk7](https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib)
* [com.android.support:appcompat-v7](https://developer.android.com/topic/libraries/support-library/)

### LICENSE
```
Copyright 2019 The ThrottleListener Contributors

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
