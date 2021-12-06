package com.github.frankmiller1874.kotlindataclassgenerator.services

import com.intellij.openapi.project.Project
import com.github.frankmiller1874.kotlindataclassgenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
