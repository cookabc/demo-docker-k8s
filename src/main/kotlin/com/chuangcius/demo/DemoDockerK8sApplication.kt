package com.chuangcius.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoDockerK8sApplication

fun main(args: Array<String>) {
    runApplication<DemoDockerK8sApplication>(*args)
}
