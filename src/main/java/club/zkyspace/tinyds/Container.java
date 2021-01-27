package club.zkyspace.tinyds;

import java.util.Iterator;

/**
 * <p>
 * 容器类层次结构的顶层接口。容器是一种特殊的对象，它的内部持有一组对象，这些对象
 * 称为容器的元素。不同的容器采用各自不同的方式管理其元素的存储结构：有些容器允许
 * 包含相同的元素，另有一些容器只允许包含对象的一份实例。有些容器中的元素存在先后
 * 次序，即使这样的两个容器中持有的对象的集合相同，但如果它们顺序不同，它们仍然被
 * 看作是不同的两个容器；另有一些容器并不关注其中元素的排列顺序。
 * </p>
 * <p>
 * 项目中提供的所有容器都提供了两种构造方法：一个无参数的构造方法，用于创建一个空
 * 的容器；一个具有单一参数{@code Container<E>}类型的构造方法，用于创建一个与其
 * 实参容器具有相同元素的新容器。
 * </p>
 * @param <E> 容器中存储的元素类型。
 */
public interface Container<E> extends Iterable<E>, Cloneable {
    /**
     * 此方法返回容器中持有元素的个数。
     * @return 此容器中的元素数量。
     */
    int size();

    /**
     * 检查容器是否为空。一个容器为空，当且仅当其不持有任何元素。
     * @return 如果此容器不包含任何元素，返回true；否则返回false。
     */
    boolean isEmpty();

    /**
     * 检查此容器中是否至少包含了一个指定的元素。
     * @param element 要检查的指定元素。
     * @return 如果容器中包含了指定的元素，返回true；否则返回false。
     */
    boolean contains(E element);

    /**
     * 检查此容器中是否包含了指定容器中的所有元素。
     * @param other 要检查的指定集合。
     * @return 如果此容器与指定容器拥有相同的元素集合，返回true；否则返回false。
     */
    boolean containsAll(Container<? extends E> other);

    /**
     * 返回一个包含此容器中所有元素的数组。
     * @return 包含此容器中所有元素的数组。
     */
    E[] toArray();

    /**
     * 从此容器中删除所有的元素。此方法返回后，该容器将为空。
     */
    void clear();

    /**
     * 确保将一个元素添加到容器当中，但具体行为由实际容器定义。
     * @param element 添加的元素。
     * @return 如果添加操作成功，返回true；否则返回false。
     */
    boolean add(E element);

    /**
     * 确保将指定容器中的所有元素全部添加到此容器中，但具体行为由实际容器定义。
     * @param other 添加的容器。
     * @return 如果添加操作成功，返回true；否则返回false。
     */
    boolean addAll(Container<? extends E> other);

    /**
     * 确保从此容器中删除一个指定元素，但具体行为由实际容器定义。
     * @param element 删除的元素。
     * @return 如果删除操作成功，返回true；否则返回false。
     */
    boolean remove(E element);

    /**
     * 确保从此容器中删除所有包含在指定容器中的元素。
     * @param other 包含删除元素的容器。
     * @return 如果删除操作成功，返回true；否则返回false。
     */
    boolean removeAll(Container<? extends E> other);

    /**
     * 返回运行在此容器上的迭代器。
     * @return 迭代器对象。
     */
    Iterator<E> iterator();
}
