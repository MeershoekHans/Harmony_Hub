pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Harmony_Hub"
include(":app")
include(":core")
include(":feature_auth")
include(":feature_schedule")
include(":feature_messaging")
include(":feature_expenses")
include(":feature_storage")
include(":feature_childtools")
include(":data")