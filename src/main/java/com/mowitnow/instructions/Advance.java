public class Advance implements Instruction {
    @Override
    public void execute(Mower mower) {
        mower.advance();
    }
}