/* Collection of Classes & Interfaces
 *
 *           Iterable
 *              ^
 *              |
 *          Collection
 *              ^
 *              |
 *    ---------------------
 *    |         |         |
 *   List     Queue      Set
 *
 * In sabhi interfaces ko kuch kuch classes implement karti hai, aur un classes ke objects bana kar hum
 * Data Structures ko implement karte hai java ke andar.
 *
 *
 * Methods on Collections -> Reference ArrayList methods
 * 
 * add
 * size
 * remove
 * iterate
 * addAll
 * removeAll
 * clear
 *
 *                        List -> sabse easy Interface hota hai implement karna
 *                         ^
 *                         |
 *             -------------------------
 *             |           |           |
 *         ArrayList   LinkedList    Vector (Similar to Arraylist but more thread safe)
 *                                     ^
 *                                     |
 *                                   Stack (Imp)
 *
 *
 *
 *                       Queue -> FIFO
 *                         ^
 *                         |
 *             -------------------------
 *             |           |           |
 *       PriorityQueue LinkedList    Deque (Double Ended Queue)
 *                                     ^
 *                                     |
 *                                   ArrayDeque
 *
 *
 *
 *                        Set -> Set Interface (Elements ina set are unique)
 *                         ^
 *                         |
 *             -------------------------
 *             |           |           |
 *          HashSet  LinkedHashSet  SortedSet
 *                                     ^
 *                                     |
 *                                  TreeSet (elements are sorted by some criteria)
 *
 *
 *
 *
 *                        Map -> Maps key with values (is implemented using sets internally)
 *                         ^
 *                         |
 *             -------------------------------------
 *             |           |           |           |
 *          HashMap  LinkedHashMap  SortedMap   HashTable (Not used much)
 *                                     ^
 *                                     |
 *                                  TreeMap (values sorted based on key)
 *
 * - We can create our own class(Data Structure) by implementing above interfaces.
 *
 * - Trees and Graphs are implemented using above interfaces only.
 *
 */