load("@rules_java//java:defs.bzl", "java_library", "java_binary")

java_library(
    name = "lib",
    srcs = ["com/example/main/Main.java"],
)

java_binary(
    name = "main",
    main_class = "com.example.main.Main",
    deps = [":lib"],
)
