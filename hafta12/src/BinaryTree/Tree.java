package BinaryTree;

import java.util.Stack;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public void insert(long data) {
        //dugum olusturduk
        Node newNode = new Node();
        //veriiyi ekleme
        newNode.data = data;

        //agac bossa
        if (root == null) {
            root = newNode;
        }
        //root doluysa
        else {
            Node current = root;
            Node parent;
            while (true) {
                //parent->su an dikkate alinan konum
                parent = current;
                //deger kokten jucukse sol alt agacta
                if (data < current.data) {
                    //current dugumun sol alt agacina gecilir
                    current = current.leftChild;
                    //
                    //
                    if (current == null) {
                        //sola ekle
                        parent.leftChild = newNode;
                        return;
                    }
                }//end if
                //deger kokten buyukse veya esitse sag alt agacta
                else {
                    //
                    current = current.rightChild;
                    //
                    //
                    if (current == null) {
                        //saga ekle
                        parent.rightChild = newNode;
                        return;
                    }
                }//end else sag
            }//end while
        }//end else root doluysa
    }//end insert

    public Node find(long data) {
        //root ile baslanir
        Node current = root;
        //anahtar degerle eslesme yoksa
        while (current.data != data) {
            //aranan anliktan kucukse sola git
            if (data < current.data) {
                current = current.leftChild;
            }
            //aranan anliktan buyukse saga git
            else {
                current = current.rightChild;
            }
            //cocuk dugumler yoksa yani bossa
            if (current == null) {
                //sayi bulunamadi
                return null;
            }
        }
        //sayi bulunduysa
        return current;
    }

    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1: {
                System.out.println("\n PreOrder:");
                preOrder(root);
            }
            case 2: {
                System.out.println("\n InOrder:");
                inOrder(root);
            }
            case 3: {
                System.out.println("\n Postorder:");
                postOrder(root);
            }
        }
        System.out.println("");
    }

    public void preOrder(Node localRoot) {
        if (localRoot != null) {
            //once kok
            System.out.print(localRoot.data + " ");
            //once sol alt
            preOrder(localRoot.leftChild);
            //once sag alt
            preOrder(localRoot.rightChild);
        }

    }

    public void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.data + " ");
            inOrder(localRoot.rightChild);
        }
    }

    public void postOrder(Node localRoot) {
        if (localRoot != null) {
            //once sol alt
            postOrder(localRoot.leftChild);
            //sonra sag alt
            postOrder(localRoot.rightChild);
            //en son kok
            System.out.print(localRoot.data + " ");
        }
    }

    public Node minimum() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        //en sol dugumdeyiz
        //bu gudum agacin kucuk elemani
        return last;
    }

    public boolean delete(long key) {
        Node current = root;
        Node parent = null;
        //varsaydik
        boolean isLeftChild = true;

        //silinecek dugum konumu bulunuyor
        while (current.data != key) {
            parent = current;
            if (key < current.data) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }
        }//end while
        //---silinecek dugum bulundu---

        //1.durum
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        }
        //2.1.durum
        else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        }
        //2.2.durum sol child yok sag child varsa
        else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        }
        //3.durum silinecek dugumun hem sol hem sag  child varsa
        else {
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            }
            //silinecek, parentin sol cocuguysa
            else if (isLeftChild) {
                parent.leftChild = successor;

            }
            //silinecek, sag cocuguysa parentin
            else {
                parent.rightChild = successor;
            }
            //successorun sol cı-ocugunu silinen dugumun sol cocugu ya
            successor.leftChild = current.leftChild;
        }
        return true;
    }

    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        //once silinecek dugumun sag cocuguna git
        Node current = delNode.rightChild;

        while (current != null) {
            successorParent = successor;
            successor = current;
            //sonraki surekli sol cocuga ait
            current = current.leftChild;
        }//sol cocuk null olunca dur successor bulundu

        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    public void displayTree() {
        Stack<Node> globalStack = new Stack<Node>();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("...............................................................");

        while (!isRowEmpty) {
            Stack<Node> localStack = new Stack<Node>();
            isRowEmpty = true;

            for (int j = 0; j < nBlanks; j++) {
                System.out.print(' ');
            }
            while (!globalStack.isEmpty()) {
                Node temp = (Node) globalStack.pop();

                if (temp != null) {
                    System.out.print(temp.data);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);

                    if (temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                }
                //temp null ise
                else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                //32 bosluk vardi sayilar arasi simdi 2 katli
                for (int j = 0; j < nBlanks * 2 - 2; j++) {
                    System.out.print(' ');
                }
            }//end ic while ->globalStack bos degil

            System.out.println();
            nBlanks /= 2;
            while (!localStack.isEmpty()) {
                globalStack.push(localStack.pop());
            }
        }//end while
        System.out.println("...............................................................");
    }
}
