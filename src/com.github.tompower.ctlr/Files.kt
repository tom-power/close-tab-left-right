package com.github.tompower.ctlr

import com.intellij.openapi.fileEditor.ex.FileEditorManagerEx
import com.intellij.openapi.vfs.VirtualFile

class Files(val editorManager: FileEditorManagerEx, val direction: Direction) {

    fun getFiles(): List<VirtualFile> {
        val currentFiles = editorManager.currentWindow.files
        val currentFileIndex = currentFiles.indexOf(editorManager.currentFile)
        return currentFiles.filter { goodIndex(currentFileIndex, currentFiles.indexOf(it)) }
    }

    private fun goodIndex(refIndex: Int, thisIndex: Int): Boolean {
        when (direction) {
            Direction.LEFT -> return refIndex > thisIndex
            Direction.RIGHT -> return refIndex < thisIndex
        }
    }

}