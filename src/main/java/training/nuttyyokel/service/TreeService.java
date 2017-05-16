package training.nuttyyokel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import training.nuttyyokel.model.Tree;
import training.nuttyyokel.repository.TreeRepository;

import java.util.List;

@Service
public class TreeService {

  @Autowired
  private TreeRepository treeRepository;

  public List<Tree> getAll() {
    return (List<Tree>) treeRepository.findAll();
  }

  public Tree getTree(int id) {
    return treeRepository.findOne(id);
  }

  public void save(Tree tree) {
    treeRepository.save(tree);
  }

  public void update(Tree tree) {
    Tree original = getTree(tree.getId());
    treeRepository.save(merge(original, tree));
  }

  public void delete(int id) {
    treeRepository.delete(id);
  }

  private Tree merge(Tree original, Tree modified) {
    Tree result = new Tree();
    result.setId(original.getId());
    result.setName(original.getName());
    result.setType(original.getType());
    result.setDatePlanted(original.getDatePlanted());
    result.setHeight(modified.getHeight());
    result.setHealth(modified.getHealth());
    return result;
  }
}
