package dk.cphbusiness.states

class Range(val floor: Int, val roof: Int, val hasUndefined: Boolean) {
    // final int floor;

    private val floorText = if (floor == Int.MIN_VALUE) "" else "$floor"
    private val roofText = if (roof == Int.MAX_VALUE) "" else "${roof - 1}"

    override fun toString(): String {
        if (hasUndefined) return "{?, $floorText...$roofText}"
        else return "{$floorText...$roofText}"
        }
    }
