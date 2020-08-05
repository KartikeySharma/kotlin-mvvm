# kotlin-mvvm + Coroutines + Hilt

[![Kotlin](https://img.shields.io/badge/kotlin-1.3.21-blue.svg)](http://kotlinlang.org) [![Gradle](https://img.shields.io/badge/gradle-3.3.2-%2366DCB8.svg)](https://developer.android.com/studio/releases/gradle-plugin) [![Mockito](https://img.shields.io/badge/mockito-2.27.0-orange.svg)](https://site.mockito.org/) [![Retrofit](https://img.shields.io/badge/retrofit-2.6.0-brightgreen)](https://square.github.io/retrofit/) [![Coroutines](https://img.shields.io/badge/coroutines-1.3.0-blueviolet)](https://kotlinlang.org/docs/reference/coroutines-overview.html) [![Coroutines-test](https://img.shields.io/badge/coroutines--test-1.3.0-yellow)](https://github.com/Kotlin/kotlinx.coroutines/tree/master/kotlinx-coroutines-test) [![OkHttp](https://img.shields.io/badge/okhttp-4.0.1-lightgrey)](https://square.github.io/okhttp/)

MVVM(Model View ViewModel) sample in Kotlin using the components ViewModel, LiveData and Coroutines, the libraries Retrofit, Gson, Glide and OkHttp. Also, sealed classes to replace callbacks. Finally for testing, Mockito and Coroutines.

## MVVM Pattern (Model View ViewModel)
 <img src="assets/AndroidMVVM.png">

## Demo

<img src="assets/kotlinmvvmscreenrotation720.gif?raw=true" height="480">

<img src="assets/kotlinmvvm720.gif?raw=true" height="480"> 

## Architecture
<img src="assets/architecture.png" height="540">

## Flow
<img src="assets/MVVMFlow.png" height="540">
 
## Screenshots

<img src="assets/screenshot.png" height="480"> <img src="assets/screenshot_error.png" height="480"> <img src="assets/screenshot_empty.png" height="480">

<img src="assets/unit_tests.png" height="196"> 

## Slides

Android MVVM https://docs.google.com/presentation/d/1nTwtU8OWYs_8Q3i_3hOPAWodDpDKzO--uA-4b6LUr8g/edit?usp=sharing

## Updates [August 2020]

- Added dependency injection with Hilt [branch hilt](https://github.com/emedinaa/kotlin-mvvm/tree/hilt)

- Added kotlin Flow and fragment ktx [branch flow](https://github.com/emedinaa/kotlin-mvvm/tree/flow)

- Room [branch room](https://github.com/emedinaa/kotlin-mvvm/tree/room)

- Added View Binding [branch viewbinding](https://github.com/emedinaa/kotlin-mvvm/tree/viewbinding)

- Dependencies versions were updated and ViewModelProviders class was removed (deprecated). [all branches](https://github.com/emedinaa/kotlin-mvvm/)

- Added Coroutines with retrofit and sealed classes to replace callbacks. Included testing with Coroutines. [branch coroutines](https://github.com/emedinaa/kotlin-mvvm/tree/coroutines)

- Added Koin, dependency injection framework written in Kotlin. Included integration with Mockito for testing (11th Oct) [branch koin](https://github.com/emedinaa/kotlin-mvvm/tree/koin)

- Added Unit Testing with Mockito (27th May) [Link](https://github.com/emedinaa/kotlin-mvvm/commit/92d9e5a659c21178364d0b51e904fd126b0b6204)

- Fix load images android P by Carlos Ugaz [carlosgub](https://github.com/carlosgub) [Link](https://github.com/emedinaa/kotlin-mvvm/pull/1)

<img src="assets/screenshot_coroutines_tests.png">


## Dependencies

- Coroutines 1 [version: '1.3.0'](https://kotlinlang.org/docs/reference/coroutines-overview.html)
- Coroutines Test 1 [version '1.3.0'](https://github.com/Kotlin/kotlinx.coroutines/tree/master/kotlinx-coroutines-test)
- LifeCycleKtx 2 [version: '2.2.0'](https://developer.android.com/kotlin/ktx)
- ViewModelKtx 2 [version: '2.2.0'](https://developer.android.com/kotlin/ktx)
- Retrofit 2 [version: '2.6.0'](https://square.github.io/retrofit/) ~~Retrofit '2.3.0'~~
- OkHttp 4 [version: '4.0.1'](https://square.github.io/okhttp/) ~~OkHttp 3.4.1~~
- Gson [version:'2.6.0'](https://github.com/google/gson)
- Glide [version: '4.9.0'](https://github.com/bumptech/glide)
- AndroidX [version: '1.2.0'](https://mvnrepository.com/artifact/androidx)
- Arch Lifecycle [version: '2.2.0'](https://developer.android.com/jetpack/androidx/releases/lifecycle)
- Mockito [version: '2.27.0'](https://site.mockito.org/)
- Arch Testing [version: '2.1.0'](https://mvnrepository.com/artifact/android.arch.core/core-testing?repo=google)

## References

- Dependency Injection on Android with Hilt https://medium.com/androiddevelopers/dependency-injection-on-android-with-hilt-67b6031e62d
- Dependency injection with Hilt https://developer.android.com/training/dependency-injection/hilt-android
- Testing coroutines on Android (Android Dev Summit 19') https://www.youtube.com/watch?v=KMb0Fs8rCRs&vl=en
- Coroutines with Architecture components https://developer.android.com/topic/libraries/architecture/coroutines?hl=en
- Sealed Classes Instead of Exceptions in Kotlin https://phauer.com/2019/sealed-classes-exceptions-kotlin/
- ViewModel https://developer.android.com/topic/libraries/architecture/viewmodel
- LiveData https://developer.android.com/topic/libraries/architecture/livedata
- Android Architecture Blueprints https://github.com/googlesamples/android-architecture
- Android Jetpack: ViewModel https://www.youtube.com/watch?v=5qlIPTDE274
- Mockito : https://site.mockito.org/
- Unit Testing + Mockito + Kotlin + Architecture components https://medium.com/@marco_cattaneo/unit-testing-with-mockito-on-kotlin-android-project-with-architecture-components-2059eb637912
- Junit + LiveData https://jeroenmols.com/blog/2019/01/17/livedatajunit5/

I appreciate any question or comment. Also, if you consider it useful , you can give me a star. Besides, you can put any issue at https://github.com/emedinaa/kotlin-mvvm/issues
