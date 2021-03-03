// swift-tools-version:5.3
import PackageDescription

let package = Package(
    name: "PolarBleSdk",
    products: [
        .library(
            name: "PolarBleSdk",
            targets: ["PolarBleSdkTargets"]),
    ],
    dependencies: [
        .package(url: "https://github.com/ReactiveX/RxSwift.git", from: "6.0.0")
    ],
    targets: [
        .binaryTarget(name: "PolarBleSdk", path: "polar-sdk-ios/PolarBleSdk.xcframework"),
        .target(name: "PolarBleSdkTargets",
                dependencies: [
                    .target(name: "PolarBleSdk"),
                    .product(name: "RxSwift", package: "RxSwift")
                ],
                path: "polar-sdk-ios/targets")
    ]
)
