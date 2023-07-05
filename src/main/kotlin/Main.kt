fun main (){
    var q = Queue(capacity = 6)
    q.enqueue(4)
    q.enqueue(5)
    q.enqueue(6)
    q.enqueue(7)
//    q.delay()
    q.dequeue()
    q.dequeue()
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    q.enqueue(4)
    q.enqueue(5)
    q.enqueue(6)
    q.enqueue(7)
//    println(q.peek())
    q.delay()

}
class Queue (var capacity:Int){
    var data = IntArray(capacity)
    var front = 0
    var rear = 0

    fun enqueue(item:Int){
        if(isFull()){
            println("queue is full")
            return
        }
        data[rear]= item
        rear++
    }

    fun dequeue (): Int?{
        if(isEmpty()){
            println("queue is empty")
            return  null
        }
        var removed =data[front]
        for (i in front until rear-1) {
            data[i] = data[i + 1]
        }
        rear --
        return removed

    }
    fun isEmpty (): Boolean{
        return  rear == front

    }
    fun isFull (): Boolean{
        return  rear == capacity
    }
    fun peek (): Int?{
        if(isEmpty()){
            return null
        }
        return  data[front]

    }

    fun delay (){
        if (isEmpty()){
            println("queue is empty")
        }
        for(i in front until rear) {
            println(data[i])
        }
    }
}