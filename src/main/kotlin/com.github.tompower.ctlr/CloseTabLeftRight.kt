package com.github.tompower.ctlr

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.fileEditor.ex.FileEditorManagerEx
import com.intellij.openapi.vfs.VirtualFile

internal class CloseTabLeftRight(
    private val event: AnActionEvent,
    private val direction: Direction,
    private val editorManager: FileEditorManagerEx = FileEditorManagerEx.getInstanceEx(event.project!!),
    private val files: List<VirtualFile> = Files(editorManager, direction)
) {
    fun closeFiles() {
        files.forEach { editorManager.currentWindow.closeFile(it) }
    }

    fun updatePresentationEnabled() {
        event.presentation.isEnabled = !files.isEmpty()
    }
}