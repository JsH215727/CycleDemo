    public class Cycle {
    
        String txt;

        @Override
                public String toString() {
                        return "Cycle [numberOfWheels=" + numberOfWheels + ", weight=" + weight
                                        + "]";
                }

        private double numberOfWheels=0, weight=0;
        
        public Cycle() throws InvalidValueException{
                this(100,1000);

        }

        public Cycle(double numberOfWheels, double weight)
                throws InvalidValueException{
            
                setWeight(weight);
                setNumberOfWheels(numberOfWheels);
        }
        
      
        public double getWeight(){
        return weight;
        }

        public double getNumberOfWheels(){
        return numberOfWheels;
        }

        public void setNumberOfWheels(double numberOfWheels )
                throws InvalidValueException{
           
            if (numberOfWheels> 0){
               this.numberOfWheels=numberOfWheels;
             
            }
            else
                throw new InvalidValueException(numberOfWheels);
        }
            
        

        public void setWeight(double weight)
                throws InvalidValueException{
        if (weight> 0){
               this.weight=weight;
             
        }
            else
                throw new InvalidValueException(weight);
        }


        }