package com.github.ruantianwei.mobanw.services

import com.github.ruantianwei.mobanw.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
