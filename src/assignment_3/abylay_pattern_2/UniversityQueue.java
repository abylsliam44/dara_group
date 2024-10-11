package assignment_3.abylay_pattern_2;

import java.util.LinkedList;
import java.util.Queue;

public class UniversityQueue {
    private Queue<Command> commandQueue = new LinkedList<>();

    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void processCommands() {
        while (!commandQueue.isEmpty()) {
            Command command = commandQueue.poll();
            command.execute();
        }
    }
}
