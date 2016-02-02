package com.github.tompower.ctlr

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.fileEditor.ex.FileEditorManagerEx

open class CloseTabLeftRight {

    fun exec(event: AnActionEvent, direction: Direction) {
        val editorManager = FileEditorManagerEx.getInstanceEx(event.project!!)
        val files = direction.files(editorManager)
        files.forEach { f -> editorManager.currentWindow.closeFile(f) }
    }

}