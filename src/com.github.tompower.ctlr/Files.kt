package com.github.tompower.ctlr

import com.intellij.openapi.fileEditor.ex.FileEditorManagerEx
import com.intellij.openapi.vfs.VirtualFile

class Files(val editorManager: FileEditorManagerEx, val direction: Direction) {

    fun getFiles(): List<VirtualFile> {
        if (!editorManager.hasOpenedFile()) {
            return emptyList()
        }
        val currentFiles = editorManager.currentWindow.files
        val currentFileIndex = currentFiles.indexOf(editorManager.currentFile)
        return currentFiles.filter { goodIndex(currentFileIndex, currentFiles.indexOf(it)) }
    }

    private fun goodIndex(refIndex: Int, thisIndex: Int): Boolean {
        when (direction) {
            Direction.LEFT -> return thisIndex < refIndex
            Direction.RIGHT -> return thisIndex > refIndex
        }
    }

}