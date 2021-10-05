//Acha Question h and easy b h so TYNT 
class MyCircularQueue {
int front=-1;
    int rear=-1;
    int arr[] ;
    int size;
    public MyCircularQueue(int k) {
        arr= new int[k];
        size=k;
    }
    
    public boolean enQueue(int value) {
        if(front==-1 && rear==-1)
        {
            front++;
            rear++;
                arr[rear]= value;
            return true;
        }
        else if((rear+1)%size==front) return false;
        else 
        {
            rear=(rear+1)%size;
            arr[rear]= value;
            return true;
        }
    }
    
    public boolean deQueue() {
        if(front==-1 && rear==-1) return false;
        else if(front==rear)
        {
            front=-1;
            rear=-1;
            return true;
        }
        else 
        {
            front=(front+1)%size;
            return true;
        }
        
    }
    
    public int Front() {
        if  (isEmpty()) return -1;
        else  return arr[front];
        
    }
    
    public int Rear() {
        if  (isEmpty()) return -1;
        else return arr[rear];
    }
    
    public boolean isEmpty() {
         if(front==-1 &&rear==-1) return true;
        else return false;
        
    }
    
    public boolean isFull() {
        if(front==0 && rear==size-1) return true;
        else if(front!=0 && rear==front-1) return true;
        else return false;
        
    }
}
