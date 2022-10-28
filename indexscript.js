function slidesPlugin(activeSlide = 0) {
    const slides = document.querySelectorAll('.slide')
    
    for(int i = 0; i<slides.length;

    slides[activeSlide].classList.add('isActive')
  
    slides.forEach((slide) =>  {
      slide.addEventListener('click', () => {
        clearActiveClasses()
  
        slide.classList.add('isActive')
      })
    })
  
    function clearActiveClasses() {
      slides.forEach((slide) => {
        slide.classList.remove('isActive')
      })
    }
  }
  
  slidesPlugin(0)