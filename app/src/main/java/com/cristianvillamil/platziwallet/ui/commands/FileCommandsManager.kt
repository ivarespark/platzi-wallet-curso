package com.cristianvillamil.platziwallet.ui.commands

import java.lang.RuntimeException

class FileCommandsManager {

    private val commands : HashMap<String, FileCommand> = HashMap()

    fun putCommand(commandName:String, fileCommand: FileCommand){
        commands.put(commandName, fileCommand)
    }

    fun getCommand(commandName: String) : FileCommand {
        if (commands.containsKey(commandName)){
            return commands.get(commandName)!!
        }else{
            throw RuntimeException("command $commandName no está registrado")
        }
    }
}