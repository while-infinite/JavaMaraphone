package day18;

public class Task3 {

    public static String dfs(Node node) {
        if (node.isAlreadyVisited() && node.getRight() == null) {                                                          //проеряем были ли на этом узле и существует ли правый узел,если да, то
            if (node.getParents() == node.getRoot()) {                                                                     // проверяем являеться ли родтельский узел корневым, елси да, то
                if (node.getParents().getLeft().isAlreadyVisited() && node.getParents().getRight().isAlreadyVisited())     //проверяем оба ли дочерних узла корневого элементы мы обошли
                    return "";
            }
            return node.getValue() + " " + dfs(node.getParents());                                                         //если мы уже были на это м узле и правого не существует,
        }                                                                                                                  //то возвращаем знаение текущего узла и переходи в родительский
        else {
            if (node.isAlreadyVisited() && node.getRight().isAlreadyVisited()) {                                            //проверяем были ли на этом и правом узле,если да, то
                if (node.getParents() == node.getRoot()) {                                                                  // проверяем являеться ли родтельский узел корневым, если да, то
                    if (node.getParents().getLeft().isAlreadyVisited() && node.getParents().getRight().isAlreadyVisited())   //проверяем оба ли дочерних узла корневого элементы мы обошли
                        return "";
                }
                return dfs(node.getParents());                                                                               //если были на текущем и правом узле, то переходим к родительскому
            } else {
                if (node.getLeft() == null) {                                                                                //проверяем наличие левого узла, если да, то
                    if (node.getRight() == null) {                                                                            //проверяем наличие правого узла, если да, то
                        node.AlreadyVisited(true);                                                                            //то ставим флаг, что мы здесь были
                        return node.getValue() + " " + dfs(node.getParents());                                                //возвращаем значение текущего узла и переходим в родительский
                    }
                    node.AlreadyVisited(true);                                                                               //если нет левого узла, но есть правый, ставим флаг что мы здесь были,
                    return node.getValue() + " " + dfs(node.getRight());                                                     //возвращаем значение текущего узла и переходим в правый
                } else {                                                                                                     //иначе, есил левый узел есть, то
                    if (node.getLeft().isAlreadyVisited()) {                                                                 //проверяем были ли мы уже на левом узле, если да, то
                        if (node.getRight() != null) {                                                                       //проверяем, существует ли правый узел, если существует, то
                            node.AlreadyVisited(true);                                                                       //ставим флаг, что мы здесь были,
                            return node.getValue() + " " + dfs(node.getRight());                                             //возвращаем текущее значение узла и переходим в правый узел
                        }
                        node.AlreadyVisited(true);                                                                           //если правого узла нет, то ставми флаг, что мыы здесь были,
                        return node.getValue() + " " + dfs(node.getParents());                                               //возвращаем текущее значение узла и переходим в родительский узел
                    }
                    node.AlreadyVisited(true);                                                                               //если мы не были в левом узле, то ставим флаг, что ы здесь были и
                    return dfs(node.getLeft());                                                                              //переходим в левый узел
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.AddNode(root, 16);
        root.AddNode(root, 8);
        root.AddNode(root, 23);
        root.AddNode(root, 150);
        root.AddNode(root, 27);
        root.AddNode(root, 18);
        root.AddNode(root, 24);
        root.AddNode(root, 22);
        root.AddNode(root, 11);
        root.AddNode(root, 15);
        root.AddNode(root, 14);
        root.AddNode(root, 5);

        System.out.println(dfs(root));
    }
}