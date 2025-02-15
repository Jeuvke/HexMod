package at.petrak.hexcasting.hexmath

enum class HexAngle {
    FORWARD, RIGHT, RIGHT_BACK, BACK, LEFT_BACK, LEFT;

    fun rotatedBy(a: HexAngle) = values()[(this.ordinal + a.ordinal) % values().size]
    operator fun times(a: HexAngle) = this.rotatedBy(a)
}