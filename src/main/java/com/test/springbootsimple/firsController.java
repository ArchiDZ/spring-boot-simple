package com.test.springbootsimple;


    import com.test.springbootsimple.models.Post;
    import com.test.springbootsimple.repo.PostRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
   // import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.bind.annotation.RestController;

    //@RestController
    @Controller
    public class firsController {

        @GetMapping("/")
        public String home( Model model) {
            model.addAttribute("title","Home page, spring boot project");
            return "home";

        }
        @Autowired
        private PostRepository postRep;
        @GetMapping("/blog_page")

        public String blog(Model model){
        Iterable<Post> posts = postRep.findAll();
        model.addAttribute("posts",posts);
            return "blog_page";
}
        @GetMapping("/blog_page/add")
        public String blogAdd(Model model){
            return "blog_add";
        }
        @PostMapping("/blog_page/add")
        public String blogPostAdd(@RequestParam String title, @RequestParam String anons,@RequestParam String full_text,Model model){
            Post post = new Post(title,anons,full_text);
            PostRepository.save(post);
            return "redirect:/blog_page";
        }

    }

