package com.github.tompower.ctlr

import com.intellij.openapi.fileEditor.ex.FileEditorManagerEx
import com.intellij.openapi.vfs.VirtualFile


class Direction(val leftRight: LeftRight) {
    fun files(editorManager: FileEditorManagerEx): List<VirtualFile>{
        val currentFiles = editorManager.currentWindow.files
        val currentFile = editorManager.currentFile
        val currentIndex = currentFiles.indexOf(currentFile)
        when (leftRight) {
            LeftRight.LEFT -> return currentFiles.filter { currentFiles.indexOf(it) < currentIndex }
            LeftRight.RIGHT -> return currentFiles.filter { currentFiles.indexOf(it) > currentIndex }
        }
    }
}