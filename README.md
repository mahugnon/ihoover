[![CI](https://github.com/mahugnon/ihoover/actions/workflows/ci.yml/badge.svg?branch=main)](https://github.com/mahugnon/ihoover/actions/workflows/ci.yml)
# ihoover
I move an aspirator from `(x,y,O)` to `(x',y',O')` in a given grid.

### Test me : 
```java

 Grille grille = new Grille(10,10);
 Aspirator aspirator = new Aspirator(5,5,'N',grille);
 aspirator.move("DADADADAA");
  
```
### My result :
```java

 aspirator.getX() : 5
 aspirator.getY() : 6
 aspirator.getOrientation() : 'N'

