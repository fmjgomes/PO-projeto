package poof.textui.shell.commands;



import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Display;
import pt.utl.ist.po.ui.Form;

import poof.core.Shell;
import poof.textui.shell.MenuEntry;

import poof.textui.shell.ShellEdit;


import static pt.utl.ist.po.ui.UserInteraction.IO;

/**
* Comando para listr entradas.
* 
* 
* @author Fabio Gomes- 177924 ,Antonio Freire- 177969 ,Joao Rodrigues- 177992
* @version 0.1
*/


public class LsEntry extends Command<Shell> {
    
    public LsEntry(Shell system) {
	super(MenuEntry.LS_ENTRY, system);
    }

    
    @Override
    @SuppressWarnings("nls")
    public final void execute() {
     

       
        

        
    }
}
