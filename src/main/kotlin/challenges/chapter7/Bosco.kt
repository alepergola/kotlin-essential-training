package challenges.chapter7

class Bosco {

    init {
        INSTANCE_COUNTER++
    }

    companion object {
        private var INSTANCE_COUNTER = 0;

        fun show(): Int {
            return INSTANCE_COUNTER
        }

        fun reset() {
            INSTANCE_COUNTER = 0
        }
    }
}