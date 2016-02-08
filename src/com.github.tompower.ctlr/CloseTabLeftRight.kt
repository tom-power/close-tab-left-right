package com.github.tompower.ctlr

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.fileEditor.ex.FileEditorManagerEx

class CloseTabLeftRight(val event: AnActionEvent, val direction: Direction) {

    val editorManager = FileEditorManagerEx.getInstanceEx(event.project!!)
    val files = Files(editorManager, direction).getFiles()

    fun closeFiles() {
        files.forEach { f -> editorManager.currentWindow.closeFile(f) }
    }

    fun contextItemEnabled() {
        event.presentation.isEnabled = !files.isEmpty()
    }

}