const routes = {}

export function registerRoute(
path,
callback
){
routes[path] = callback
}

export function navigate(){

const hash =
location.hash || "#/"

const page =
routes[hash]

if(page){
page()
}
}

window.addEventListener(
"hashchange",
navigate
)