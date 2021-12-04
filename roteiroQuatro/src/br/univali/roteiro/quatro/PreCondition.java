package br.univali.roteiro.quatro;

import java.util.Collection;

/**
 * Implements various validations.
 */
@SuppressWarnings("unchecked")
public class PreCondition {

    /**
     * Constructor method (static). It allows fluent interface.
     *
     * @return a new PreCodition object
     */
    public static PreCondition mustBe() {
        return new PreCondition();
    }

    /**
     * Assure that the object is not null.
     * @param object the object to be checked
     * @return the IllegalArgumentException if the object is null, this PreCondition object otherwise
     */
    public PreCondition notNull(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("Argument must be NOT NULL.");
        }
        return this;
    }

    /**
     * Assure that the string is not empty ("").
     * @param str the string to be checked
     * @return the IllegalArgumentException if the string is empty, this PreCondition object otherwise
     */
    public PreCondition notEmpty(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("String must be NOT EMPTY.");
        }
        return this;
    }

    /**
     * Assure that the string is not just a sequence of blanks ("   ").
     * @param str the string to be checked
     * @return the IllegalArgumentException if the string is just a sequence of blanks, this PreCondition object otherwise
     */
    public PreCondition notJustBlanks(String str) {
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("String must be NOT ALL BLANKS.");
        }
        return this;
    }

    /**
     * Checks if value is in the range [minValue, maxValue], inclusive.
     * @param value the value to be checked
     * @param minValue the minimum value of the range
     * @param maxValue the maximum value of the range
     * @return the IllegalArgumentException if the value is not in the range, this PreCondition object otherwise
     */
    public PreCondition inRange(Comparable value, Comparable minValue, Comparable maxValue) {
        mustBe().notNull(value)
                .notNull(minValue)
                .notNull(maxValue)
                .greaterOrEqualTo(maxValue, minValue);
        if (value.compareTo(minValue) < 0 || value.compareTo(maxValue) > 0) {
            throw new IllegalArgumentException(
                    String.format("Argument %s (%s) must be in the range[%s..%s].",
                            value.getClass(), value, minValue, maxValue));
        }
        return this;
    }

    /**
     * Checks if value is less than ceiling.
     * @param value the value to be checked
     * @param ceiling the maximum value
     * @return the IllegalArgumentException if the value is not less than ceiling, this PreCondition object otherwise
     */
    public PreCondition lessThan(Comparable value, Comparable ceiling) {
        mustBe().notNull(value).notNull(ceiling);
        if (value.compareTo(ceiling) < 0) {
            throw new IllegalArgumentException(
                    String.format("Argument %s (%s) must be less than %s.", value.getClass(), value, ceiling));
        }
        return this;
    }

    /**
     * Checks if value is less or equal to ceiling.
     * @param value the value to be checked
     * @param ceiling the maximum value
     * @return the IllegalArgumentException if the value is not less or equal to ceiling, this PreCondition object otherwise
     */
    public PreCondition lessOrEqualTo(Comparable value, Comparable ceiling) {
        mustBe().notNull(value).notNull(ceiling);
        if (value.compareTo(ceiling) <= 0) {
            throw new IllegalArgumentException(
                    String.format("Argument %s (%s) must be less or equal to %s.", value.getClass(), value, ceiling));
        }
        return this;
    }

    /**
     * Checks if value is greater than floor.
     * @param value the value to be checked
     * @param floor the minimum value
     * @return the IllegalArgumentException if the value is not greater than floor, this PreCondition object otherwise
     */
    public PreCondition greaterThan(Comparable value, Comparable floor) {
        mustBe().notNull(value).notNull(floor);
        if (value.compareTo(floor) > 0) {
            throw new IllegalArgumentException(
                    String.format("Argument %s (%s) must be greater than %s.", value.getClass(), value, floor));
        }
        return this;
    }

    /**
     * Checks if value is greater or equal to floor.
     * @param value the value to be checked
     * @param floor the minimum value
     * @return the IllegalArgumentException if the value is not greater or equal to floor, this PreCondition object otherwise
     */
    public PreCondition greaterOrEqualTo(Comparable value, Comparable floor) {
        mustBe().notNull(value).notNull(floor);
        if (value.compareTo(floor) >= 0) {
            throw new IllegalArgumentException(
                    String.format("Argument %s (%s) must be greater or equal to %s.", value.getClass(), value, floor));
        }
        return this;
    }

    /**
     * Checks if value is equal to floor.
     * @param value the value to be checked
     * @param other the other value to compared to
     * @return the IllegalArgumentException if the value is not equal to other, this PreCondition object otherwise
     */
    public PreCondition equalsTo(Comparable value, Comparable other) {
        mustBe().notNull(value).notNull(other);
        if (value.compareTo(other) != 0) {
            throw new IllegalArgumentException(
                    String.format("Argument %s (%s) must be isAlmost to %s.", value.getClass(), value, other));
        }
        return this;
    }

    /**
     * Checks if the list is not empty.
     * @param list the list to be checked
     * @return the IllegalArgumentException if the list is null or if it is empty, this PreCondition object otherwise
     */
    public PreCondition notEmpty(Collection list) {
        mustBe().notNull(list);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Collection<?> must not be empty.");
        }
        return this;
    }

    /**
     * Assures that the object is not in list.
     * @param object the object (element) to be checked
     * @param list the list to be checked
     * @return the IllegalArgumentException if the object is in list, this PreCondition object otherwise
     */
    public PreCondition notIn(Object object, Collection list) {
        mustBe().notNull(list);
        if (list.contains(object)) {
            String objInfo = object == null ? "null" : object.getClass().getName();
            throw new IllegalArgumentException(
                    String.format("Collection<%s> must not contain %s.", objInfo, objInfo));
        }
        return this;
    }

    /**
     * Assures that the object is in list.
     * @param object the object (element) to be checked
     * @param list the list to be checked
     * @return the IllegalArgumentException if the object is not in list, this PreCondition object otherwise
     */
    public PreCondition in(Object object, Collection list) {
        mustBe().notNull(list);
        if (!list.contains(object)) {
            String objInfo = object == null ? "null" : object.getClass().getName();
            throw new IllegalArgumentException(
                    String.format("Collection<%s> must contain %s.", objInfo, objInfo));
        }
        return this;
    }

    /**
     * The constructor must be private because the instatiation must be via the constructor method mustBe.
     */
    private PreCondition() {
    }
}
