package com.github.tompower.ctlr

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.fileEditor.ex.FileEditorManagerEx

class CloseTabLeftRight(val event: AnActionEvent, val direction: Direction) {

    fun exec() {
        val editorManager = FileEditorManagerEx.getInstanceEx(event.project!!)
        Files(editorManager, direction).getFiles().forEach { f -> editorManager.currentWindow.closeFile(f) }
    }

}