package net.kingdomofkingdoms.Qwertyness_.interactables.interactable;

import java.util.List;

public interface Interactable {
	
	/*
	 * Gets the name of the Interacable.  This value can be used to delete the interactable later or be set as the custom display
	 * name of an entity interactable.
	 */
	public String getName();
	
	/*
	 * Sets the name field of the interactable. Can be used to change the physical interactable of the Interactable instance to avoid
	 * the creation of another instance, although this action is messy and not recommended.
	 */
	public String setName();
	
	public List<InteractCommand> getCommands();
	
	/*
	 * Adds a command in the form of the InteractCommand object consisting of a String and an InteractSender
	 */
	public void addCommand(InteractCommand command);
	
	/*
	 * Removes a command based on an index of it's position in the list.  This relies on the ability to get command indexes via 
	 * in-game command.
	 */
	public void removeCommand(int index);
	
	/*
	 * Sets all the commands of the Interactable via a list of InteractCommands.  This should be used by the addCommand() and
	 * removeCommand() methods to set the new value of a List<InteractCommand> commands field.
	 */
	public void setCommands(List<InteractCommand> commands);
	
	/*
	 * Adds a message in the form of a String object.
	 */
	public void addMessage(String message);
	
	/*
	 * Removes a message based on an index of it's position in the list.  This relies on the ability to get message indexes via 
	 * in-game command.
	 */
	public void removeMessage(int index);
	
	/*
	 * Sets all the messages of the Interactable via a list of Strings.  This should be used by the addMessage() and
	 * removeMessage() methods to set the new value of a List<String> messages field.
	 */
	public void setMessages(List<String> messages);
	
	/*
	 * Gets the current cooldown of the Interactable in the form of an int variable messured in seconds.
	 */
	public int getCooldown();
	
	/*
	 * Sets the cooldown of the interacable via an int containing the cooldown variable in seconds
	 */
	public void setCooldown(int seconds);
}
