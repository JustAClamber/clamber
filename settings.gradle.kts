rootProject.name = "clamber"

//为项目访问器添加了一项实验性功能，可提供类型安全并在 IDE 中启用代码完成
//参考：https://docs.gradle.org/7.4/userguide/declaring_dependencies.html#sec:type-safe-project-accessors
//dependencies {
//  // type-safe alternative to project(":client")
//  implementation projects.client
//}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
enableFeaturePreview("VERSION_CATALOGS")

include(
    "app"
)
