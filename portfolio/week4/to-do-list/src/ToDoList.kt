// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    //use object funtions of ToDoItem to identify which ones have which status
    val size get() = items.size
    val notStarted get() = items.count { it.status == ItemStatus.NotStarted } // compute no. of items with NotStarted status
    val inProgress get() = items.count { it.status == ItemStatus.InProgress } // compute no. of items with InProgress status
    val done get() = items.count { it.status == ItemStatus.Done } // compute no. of items with Done status
    val overdue get() = items.count { it.isOverdue() } // compute no. of overdue items

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        // Implement code to read To Do list from a file here
        // See data/to-do.csv for an example of the format
        //break each line down into its three compoenents and parse into an object of ToDoItem
        Path(filename).forEachLine {
            val itemBreakdown = it.split(": ")
            //0 = date 1 = status 2 = description 
            //date needs to be a local date type
            val date = LocalDate.parse(itemBreakdown[0])
            //status requires a itemStatus type to be in object 
            val status = ItemStatus.valueOf(itemBreakdown[1])
            val item = ToDoItem(date, status, itemBreakdown[2])
            items.add(item)
        }

    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean {
        // Write code here to remove items with status of Done
        // Return true if any were removed, false if none were removed
        //cheeky removeAll fucntion on status being done 
        return items.removeAll { it.status == ItemStatus.Done}
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        // status, or a list of all items if status argument is null
        //if the status is null then no data was pared so filter if there is a status
        if (status == null){
            return items.toList()
            }
        return items.filter { it.status == status }
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        // that are due on the specified date
        //filter out which ones have the due date equal to the current date 
        return items.filter { it.dueDate == date }
    }
}
